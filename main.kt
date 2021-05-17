import kotlin.browser.*
import org.w3c.dom.*


/* Quiz Kotlin 
Desenvolvido por Guilherme Novaes Fonseca
*/

val answer1 = document.getElementById("question1") as HTMLInputElement;

val answer2 = document.getElementById("question2") as HTMLInputElement;

val answer3 = document.getElementById("question3") as HTMLInputElement;

val answer4 = document.getElementById("question4") as HTMLInputElement;

val answer5 = document.getElementById("question5") as HTMLInputElement;

val questoes =document.getElementById("quizquestions") as HTMLDivElement

val q1 = document.getElementById("q1") as HTMLDivElement

val q2 = document.getElementById("q2") as HTMLDivElement

val q3 = document.getElementById("q3") as HTMLDivElement

val q4 = document.getElementById("q4") as HTMLDivElement

val q5 = document.getElementById("q5") as HTMLDivElement

val dica = document.getElementById("dica") as HTMLDivElement

val newPage= document.getElementById("mostrarRespostas") as HTMLButtonElement

val nome = document.getElementById("nome") as HTMLDivElement

val restart = document.getElementById("reiniciar") as HTMLButtonElement


//Função que pega todas as respostas dadas e verifica se está correta
@JsName("pegarResp")
fun pegarResp(){
  
val resp1 =answer1.value
val resp2 =answer2.value
val resp3 =answer3.value
val resp4 =answer4.value
val resp5 =answer5.value

  if (resp1.toUpperCase() == "BRASIL") {
         q1.innerHTML="Você acertou a questão 1"
         
      }

      if (resp2.toUpperCase() == "KLOSE" || resp2.toUpperCase()=="MIROSLAV KLOSE") {
        q2.innerHTML="Você acertou a questão 2"
       
      }
     
      if (resp3 =="1930" || resp3.toUpperCase()=="MIL NOVECENTOS E TRINTA") {
        q3.innerHTML="Você acertou a questão 3"
       
      }
     
      if (resp4.toUpperCase() == "URUGUAI") {
        q4.innerHTML="Você acertou a questão 4"
     
      }
     
      if (resp5.toUpperCase() == "CATAR" || resp5.toUpperCase() == "QATAR") {
        q5.innerHTML="Você acertou a questão 5"
      
      }    
}

//Função que submete todas as respostas e carrega a nova página
@JsName("submitAnswers")
fun submitAnswers(){
  var botao=document.getElementById("botaoResp") as HTMLButtonElement

  botao.style.display="none"

      pegarResp()
      
     questoes.style.display="none"

     newPage.style.display="block"  
     
     dica.style.display ="none"

     val pegarNome= window.prompt("Jogador, digite seu nome")
     if(pegarNome != null){
     nome.innerHTML="$pegarNome"
     }
     nome.style.display="block"

     restart.style.display="block"

}

//Função para abrir mais uma página HTML
@JsName("mostrarRespostas")
fun mostarResp(){

  val abrir=window.confirm("Apertando sim o navegador abrirá mais uma página")

  if(abrir){

  window.open("https://projetoLPFQuiz.gnovaesf.repl.co/respostaHist.html")

  }
}

//Função que reinicia o quiz
@JsName("reiniciar")
fun reiniciar_quiz(){

val voltar=window.confirm("Reiniciar jogo?")

if(voltar){

  window.location.href=("https://projetolpfquiz.gnovaesf.repl.co/quiz_main.html")
}
}

  
   
      
