let lista = [];
function add(){
   let modelo = document.getElementById("model").value;//variavel
   let preco = document.getElementById("preco").value;//variavel
   lista.push({modelo, preco});
   console.log(lista);
   //let newlist = document.createElement("li");//criar lista
   //let element = document.getElementById("lista");//elemento q add na lista
  console.log("modelo: " + modelo + "\npreço: " + preco);
}
/*function listarCarros(){
    newlist.getElementById("li"); 
    let listnew = document.createElement("il");
    console.log("bla bla: " + listnew);
}*/
function listar(){
    let listaNova = "";
    for(let i = 0; i < lista.length; i++);{
    listaNova += "modelo: " + lista[i].modelo + "R$: " +
    lista[i].preco + "<br>";
}
document.getElementById("texto").innerHTML = listaNova;
}
function filtrar(){
    valorAFiltrar  = prompt ("Digite o preço pelo que deseja filtrar");
    let listaFiltro = "";
    for(i = 0; i < lista.length; i++){
        if(lista[i].preco <= valorAFiltrar){
            listaFiltro += "modelo: " + lista[i].modelo +
             "preco: " + lista[i].preco 










































             

        }
    }
}