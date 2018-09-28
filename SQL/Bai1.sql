use QLTHUVIEN;
drop table SACH;
create table SACH(
	masach int not null auto_increment primary key,
    ten varchar(40),
    tacgia varchar(40),
    nxb varchar(20),
    soluong int
    );
create table DOCGIA(
	sothe int not null auto_increment primary key,
    ten varchar(40) not null,
    khoa char(20) not null,
    khoahoc varchar(20),
    thoihanthe datetime
    );
drop table DOCGIA;
create table PHIEUMUON(
	masach int not null,
    sothe int not null,
    ngaymuon date,
    ngaytra date,
    ghichu varchar(100),
    primary key(masach, sothe),
    foreign key(masach) references SACH(masach),
    foreign key(sothe) references DOCGIA(sothe)
    );
drop table PHIEUMUON;

select * from PHIEUMUON;
select * from DOCGIA;
select * from SACH;

insert into SACH(ten, tacgia, nxb, soluong) values ('Dai so', 'Nguyen Dinh Tri', 'nxb giao duc', 10);
insert into SACH(ten, tacgia, nxb, soluong) values ('Giai tich', 'Vu Van Anh', 'nxb khoa hoc', 20);
insert into SACH(ten, tacgia, nxb, soluong) values ('Vat ly', 'Tran Bao Binh', 'nxb giao duc', 30);
insert into SACH(ten, tacgia, nxb, soluong) values ('Hoa hoc', 'Ngo van Can', 'nxb khoa hoc', 20);
insert into SACH(ten, tacgia, nxb, soluong) values ('Hinh hoc', 'Nguyen Thi Thi', 'nxb giao duc', 10);
insert into SACH(ten, tacgia, nxb, soluong) values ('Lap trinh C', 'Tran Bao Van', 'nxb giao duc', 10);

insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Nguyen Van Anh', 'An toan', 'AT13', STR_TO_DATE('30/08/2019', '%d/%m/%Y'));
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Tran Thi Nga', 'Dien tu', 'DT11', STR_TO_DATE('30/08/2020', '%d/%m/%Y'));
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Ngo Quang Hieu', 'Toan', 'TT15', STR_TO_DATE('30/08/2021', '%d/%m/%Y'));
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Nguyen Van Minh', 'CNTT', 'CT12', STR_TO_DATE('30/08/2022', '%d/%m/%Y'));
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Nguyen Van Anh', 'An toan', 'AT14', STR_TO_DATE('30/08/2019', '%d/%m/%Y'));

insert into PHIEUMUON(masach, sothe, ngaymuon) values
(1, 5, STR_TO_DATE('24/03/2018', '%d/%m/%Y'));
insert into PHIEUMUON(masach, sothe, ngaymuon) values
(2, 4, STR_TO_DATE('12/02/2018', '%d/%m/%Y'));
insert into PHIEUMUON(masach, sothe, ngaymuon) values
(3, 3, STR_TO_DATE('01/02/2018', '%d/%m/%Y'));
insert into PHIEUMUON(masach, sothe, ngaymuon) values
(4, 2, STR_TO_DATE('14/01/2018', '%d/%m/%Y'));
insert into PHIEUMUON(masach, sothe, ngaymuon) values
(5, 1, STR_TO_DATE('24/01/2018', '%d/%m/%Y'));
insert into PHIEUMUON(masach, sothe, ngaymuon) values
(5, 2, STR_TO_DATE('24/02/2018', '%d/%m/%Y'));

/*Xoa*/
delete from PHIEUMUON where masach = 5 and sothe = 2;	

/*Cap nhat*/
update PHIEUMUON set ngaytra = str_to_date('24/09/2018','%d/%m/%y') where masach = 5 and sothe = 1;
update PHIEUMUON set ngaytra = str_to_date('12/8/2018','%d/%m/%y') where masach = 1 and sothe = 5;

/*Hiển thị tên, khoa của các độc giả và sắp xếp theo khoa*/
select * from DOCGIA order by khoa asc;

/*Tim những đọc giả mượn sách Dai So vào ngày 24/3/2018*/
select DOCGIA.ten
from PHIEUMUON join DOCGIA on PHIEUMUON.sothe = DOCGIA.sothe
join SACH on SACH.masach = PHIEUMUON.masach
where SACH.ten = 'Dai So' and PHIEUMUON.ngaymuon = str_to_date('24/03/2018','%d/%m/%Y');

/*Hiển thị tên, số thẻ, tên sách của tất cả đọc giả mượn sách trong tháng 1/2018*/
select DOCGIA.ten, PHIEUMUON.sothe, SACH.ten from PHIEUMUON
join DOCGIA on PHIEUMUON.sothe = DOCGIA.sothe
join SACH on PHIEUMUON.masach = SACH.masach
where PHIEUMUON.ngaymuon between str_to_date('01/01/2018','%d/%m/%Y') and str_to_date('31/01/2018','%d/%m/%Y');

/*Danh sách các sách không ai mượn*/
select distinct SACH.masach, SACH.ten from SACH, PHIEUMUON
where SACH.masach not in (select distinct masach from PHIEUMUON);
 /*Cho biết đọc giả tên Anh mượn sách bao nhiêu lần*/
select count(*) from PHIEUMUON, DOCGIA, SACH
where PHIEUMUON.masach = SACH.masach and PHIEUMUON.sothe = DOCGIA.sothe and DOCGIA.ten like '%Anh';

/*Danh sách tên, số thẻ, các độc giả chưa trả sách*/
select DOCGIA.ten, DOCGIA.sothe from DOCGIA, PHIEUMUON
where DOCGIA.sothe = PHIEUMUON.sothe and PHIEUMUON.ngaytra is null;