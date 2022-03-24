const fetchPokemon = () => {
    const pokeNameInput = document.getElementById("pokeName");
    let pokeName = pokeNameInput.value;
    pokeName = pokeName.toLowerCase();
    const url_source = `https://pokeapi.co/api/v2/pokemon/${pokeName}`;
  
    /* **** Fetch o solicitud a la poke api ***
        * fetch(url) -> Solicita la informacion al servidor 
        * .then(res) El resultado se almacena en una respuesta
        * despues de => tenemos la respuesta que vamos a obtener 
    */ 
    fetch(url_source).then((res) => {
        if (res.status != "200") {
            // Se imprime la respuesta obtenida (se visualiza con f5)
            console.log(res);
            pokeImage("https://c.tenor.com/mcK7VzP7V1MAAAAC/charmander-pokemon.gif")
            showPokeName("Sin información");
            showPokeType("Sin información");
            showPokeWeight("Sin información");
            showPokeMoves(" ");
            showPokeHeight("Sin información");
          
            showStats(["Sin informacion"], [0]);
        }
        else {
            return res.json();
        }
    }).then((data) => { 
        // EL resultado de la segunda parte de la promesa se almacena en "data"
        if (data) {
            //Se imprime el resultado de data (primer nivel del objeto)
            console.log("data: ", data);
            let pokeImg = data.sprites.front_default;
            pokeImage(pokeImg);
            console.log("url main image: ", pokeImg);

           // Obtiene el nombre del pokemon
            let pokemonname = data.species.name;
            showPokeName( pokemonname );
         
           // Obtiene tipo del pokemon
            let pokemontype = data.types[0].type.name;
            showPokeType( pokemontype )
            console.log("tipo: ", pokemontype);

          
           // Obtiene peso del pokemon
            let pokemonWeight = data.weight;
            showPokeWeight( pokemonWeight )
            console.log("Peso: ", pokemonWeight);

            
           // Obtiene altura del pokemon
            let pokemonHeight = data.height;
            showPokeHeight( parseInt(pokemonHeight)/10 )
            console.log("Altura: ", parseInt(pokemonHeight)/10 );
          
           // Obtiene objeto con movimientos del pokemon y otra información
            let pokemonMoves = data.moves;
            
            let longitud = 0; 
            if  (pokemonMoves.length > 10){
              longitud = 10
            } else {
                longitud = pokemonMoves.length
            }
            
            // Se crea arreglo con SOLO 10 de los movimeintos
            let pokeMovesOnly = []
            for(let i=0; i<longitud; i++) {
              pokeMovesOnly.push(pokemonMoves[i].move.name)
            }
            // console.log(`Element at index ${i} is ${pokemonMoves[i].move.name}`);
            showPokeMoves( pokeMovesOnly)
          console.log ("Movimientos: ", pokeMovesOnly)
          

        //***************************
          
           // Obtiene ESTADISTICAS DEL POKEMON 
            let pokemonStats = data.stats;
            
            
            // Se crea arreglo con laas 5 estadisticas
            let stats_label = [];
            let stats_value = [];
            for(let i=0; i<pokemonStats.length; i++) {
              stats_label.push(pokemonStats[i].stat.name)
              stats_value.push(pokemonStats[i].base_stat)
            }
            // console.log(`Element at index ${i} is ${pokemonMoves[i].move.name}`);
            console.log ( "stat label: ", stats_label);
            console.log ( "stat value: ", stats_value);
            showStats(stats_label, stats_value)

          
        }
    });
}




// Se crea un evento: Funcion pokeImage para cambiar url 
const pokeImage = (url) => {
    // document.getElementById  Lee el documento de html y busca el ID = pokeImg
  
            console.log("url: 85 ", url);
            //console.log("pokemonname: ", pokemonname);
    const pokePhoto = document.getElementById("pokeImg");
    //pokePhoto.src --> src es el atributo que vamos a cambiar
    pokePhoto.src = url;
}


//ooooooooooooooooooooooooooooooooooooooooooooooooo

// Se crea un evento: Funcion ShowPokeName para mostrar el nombre del pokemon en el pokedex 
const showPokeName = (name) => {
    document.getElementById("NamePokemon").innerHTML = name;
}

const showPokeType = (type) => {
    document.getElementById("TipoPokemon").innerHTML = type;
}

const showPokeWeight = (weight) => {
    document.getElementById("PesoPokemon").innerHTML = weight;
}

const showPokeHeight = (height) => {
    document.getElementById("AlturaPokemon").innerHTML = height;
}


const showPokeMoves = (list) => {
    let codigo  = "";
  
    /*Crea el codigo para crear la lista de movimientos*/
    for(let i=0; i<list.length; i++) {
      codigo +=  "<li> "+list[i] +"<\/li> \n "
    }
  
    console.log("codigo: ", codigo)
    document.getElementById("MovesPokemon").innerHTML = codigo;
}


/***************************************************************/
    
    var xValues = ["Sin valores"];
    var yValues = [0];
    var barColors = ["red", "green","blue","orange","brown", "#67257e"];

    var grafica = new Chart("myChart", {
        type: "bar",
        data: {
          labels: xValues,
          datasets: [{
            backgroundColor: barColors,
            data: yValues,
            borderColor: '#FFF', // Color del borde
            borderWidth: 1,// Ancho del borde
          }]
        },
        options: {
          legend: {display: false},
          labels:{fontColor: "#CCC"},
                  scales: {
                      yAxes: [{
                              display: true,
                              ticks: {
                                  beginAtZero: true,
                                  steps: 10,
                                  stepValue: 5,
                                  min: 0
                              }
                          }]
                  },
          title: {
            display: true,
            text: "Estadísticas",
            fontColor: "black"
          },
        }
      });
  


/* +++++++++++++++++++++++++++++++++++++++++++++++ */
/* Grafica de barras para estadisticas */

const showStats = (label, values) => {

    grafica.data.labels = label;
    grafica.data.datasets.pop();
    grafica.data.datasets.push({
        backgroundColor:  barColors,
        data: values
    });
    grafica.update();
    console.log ("grafica: ", grafica);
     grafica.update();
    grafica.render();
  
}


/*

    chart.data.datasets.push({
        label: label,
        backgroundColor: color,
        data: data
    });
*/