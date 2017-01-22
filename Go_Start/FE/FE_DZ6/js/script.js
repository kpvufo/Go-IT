var leader = {
     name: "Василий Иванович",
     age: 35
};

var leaderStr = JSON.stringify(leader);
leader = JSON.parse(leaderStr);

alert(JSON.stringify(leader,["name", "age"]));

console.log(leader)
