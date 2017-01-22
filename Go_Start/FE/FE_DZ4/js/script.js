*var a = 1, b = 3, pi = 3.14159;

*var r = prompt('Введите радиус основания "r"', 5);
*var h = prompt('Введите высота конуса "h"', 10);

*var v = (a / b) * pi * (r * r) * h;
*console.log(v)

*alert(v);

*var answer = confirm("ДЗ выполненно правильно?");

*alert( answer );

*var a = 1, b = 2

*if (a + b < 4) { 
     result = 'Мало'; 
} *else { 
     result = 'Много'; 
}

var number = prompt('Введите любое значение', '');
if (number < 0) {
	alert('-1')
} else if (number > 0) {
	alert('1')
} else {
	alert('0');
}

var access;
var age = prompt('значение', '');

access = (age > 14) ? true : false;
// Условие ? значение1 : значение2
alert(access);