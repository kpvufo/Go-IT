function pow(b, e) {
  var result = b;

  for (var i = 1; i < e; i++) {
    result *= b;
  }

  return result;
}

var b = prompt('Введите число "base"','');
var e = prompt('Введите степень "exponent"', '');

if (e <= 1) {
  alert('Степень ' + e +
    'не поддерживается, введите целую степень, большую 1'
  );
} else {
  alert( pow(b, e) );
}

console.log(pow)