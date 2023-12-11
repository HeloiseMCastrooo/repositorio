function but(){
    let modelom = document.getElementById("modelo").value;
    let precom = document.getElementById("preco").value;
    let entrada = document.getElementById("entradaval").value;
/////////////////////////////////////////////////////////////////////////
    let resto = precom - entrada;
    let parcelas = (resto/10);
    let juros = parcelas + (parcelas * 0.10);
/////////////////////////////////////////////////////////////////////////
    document.getElementById('val').innerHTML = 
    "<br>O modelo do veículo é: "+ modelom +
    "<br><br>O preço do veículo será: " + precom +
    "<br><br>O valor das parcelas será de: " + parcelas + 
    "<br><br>O valor das parcelas com os juros será de: " + juros;
/////////////////////////////////////////////////////////////////////////
}