function process() {
            var elementA = document.getElementById("num1");
            var elementB = document.getElementById("num2");
            var elementSUM = document.getElementById("sum");
            var elementSUB = document.getElementById("sub");
            var elementMULTI = document.getElementById("multi");
            var elementDIV = document.getElementById("div");
            
            var sum = parseInt(elementA.value) + parseInt(elementB.value);
            var sub = parseInt(elementA.value) - parseInt(elementB.value);
            var multi = parseInt(elementA.value) * parseInt(elementB.value);
            var div = parseInt(elementA.value) / parseInt(elementB.value);
            
            elementSUM.innerText = sum;
            elementSUB.innerText = sub;
            elementMULTI.innerText = multi;
            elementDIV.innerText = div;
        }