function obterListaVeiculo(){
    return JSON.parse(localStorage.getItem('veiculo')) || [];
}
function salvarListaVeiculo(lista){
    localStorage.setItem('veiculo', JSON.stringify(lista));
}
let listaVeiculo = obterListaVeiculo();
//********************copia***************************
//json nos precos e nas parcelas 
function adicionar(){
     modelom = document.getElementById("modelo").value;
     precom = document.getElementById("preco").value;
     entrada = document.getElementById("entradaval").value;

//function adicionar(){
    ////////////////////////////////////////
//}
/////////////////////////////////////////////////////////////////////////
if(modelom && precom && entrada){
    let resto = precom - entrada;
    let parcelas = (resto/10);
    let juros = parcelas + (parcelas * 0.10);

listaVeiculo.push({modelom, precom, entrada, juros});
salvarListaVeiculo(listaVeiculo);
limparCampo();

}
}
function limparCampo(){
    document.getElementById("modelo").value = "";
    document.getElementById("preco").value = "";
    document.getElementById("entradaval").value = "";
 
}
function but(){
    let parcelasVal = "";
    for(i = 0; i < listaVeiculo.length; i++){
        parcelasVal += "<br><br>modelo: " + listaVeiculo[i].modelom +
        "<br>preco: " + listaVeiculo[i].precom +
        "<br>valor de entrada: " + listaVeiculo[i].entrada +
        "<br>valor das parcelas com juros: " + listaVeiculo[i].juros;
    }
    document.getElementById("val").innerHTML = parcelasVal;
}

/////////////////////////////////////////////////////////////////////////
    /*document.getElementById('val').innerHTML = 
    "<br>O modelo do veículo é: "+ modelom +
    "<br><br>O preço do veículo será: " + precom +
    "<br><br>O valor das parcelas será de: " + parcelas + 
    "<br><br>O valor das parcelas com os juros será de: " + juros;
/////////////////////////////////////////////////////////////////////////
}*/





/*function obterListaProduto(){
    return JSON.parse(localStorage.getItem('produtos')) || [];//json "converte" em string
}//json recebe os dados do usuario e armazena num site/servidor web
function salvarListaProdutos(lista){
    localStorage.setItem('produtos', JSON.stringify(lista)); //stringfy transforma em string
}
let listaProdutos = obterListaProduto();

function adicionaProduto(){
    const nome = document.getElementById('nome-produto').value;
    const preco = parseFloat(document.getElementById('preco-produto').value);
    if(nome&&preco){
        listaProdutos.push({nome, preco});
        salvarListaProdutos(listaProdutos);
        atualizarListaProduto();
        limparCampos();
    }*/



