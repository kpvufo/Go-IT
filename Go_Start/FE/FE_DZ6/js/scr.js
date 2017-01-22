var leader = {
  id: 1,
  name: "Василий Иванович"
};

var soldier = {
  id: 2,
  name: "Петька"
};

leader.soldierId = 2;
soldier.leaderId = 1;

var team = {
  1: leader,
  2: soldier
};

alert(JSON.stringify(team), ["name"]);

console.log(team)