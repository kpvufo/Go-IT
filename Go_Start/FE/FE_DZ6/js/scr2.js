var leader = {
      name: "Василий Иванович",
      occupy: function() {
        alert( this.name );
      }
    };
    
    var team = {
      name: "Петька",
      leader: leader
    };
    
    alert( JSON.stringify(team) );

    console.log(team)