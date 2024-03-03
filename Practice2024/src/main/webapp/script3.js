/**
 * 
 */
/**
 * 
 */

document.write("THis is a sepeate Js file");
// alert("The file is working");
document.write("<br/>" + "<h2>JavaScript Rules</h2>");
document.write("<hr/>");
var phrase = "   arun teja    ";
let num = 10;
var age = 23;
var gpa = 3.5;
var isMale = true;
var flaws = null;
var description = undefined;

document.write("<br/>" + age);
document.write("<br/>" + gpa);
document.write("<br/>" + isMale);
document.write("<br/>" + flaws);
document.write("<br/>" + description);
document.write("<br/>" + phrase + "<br/>" + num + "<br/>");


document.write("<br/>" + phrase.length);
document.write("<br/>" + phrase.toUpperCase());
document.write("<br/>" + phrase.toLowerCase());
document.write("<br/>" + phrase.charAt(1));
document.write("<br/>" + phrase.indexOf("u"));
document.write("<br/>" + phrase.lastIndexOf("a"));
document.write("<br/>" + phrase.substring(0, 3));
document.write("<br/>" + phrase.substring(phrase.indexOf("r"), phrase.length));
document.write("<br/>" + phrase.endsWith("teja"));
document.write("<br/>" + phrase.includes("n te"));
document.write("<br/>" + phrase.slice(0, 2));
document.write("<br/>" + phrase.slice(-2));
document.write("<br/>" + phrase.replace("arun", "virat"));
document.write("<br/>" + phrase.replace(/a/g, "q"));
document.write("<br/>" + phrase.trim());



var text = ' is a good boy';

document.write("<br/>" + phrase + text);
document.write("<br/>" + 2 + "<br/>");
document.write(2 + 2);
document.write("<br/>" + "break");
document.write("<br/>" + Math.abs(-5));
document.write("<br/>" + Math.max(2, 4));
document.write("<br/>" + Math.min(3, 4));
document.write("<br/>" + Math.round(3.5));
document.write("<br/>" + Math.pow(2, 3));
document.write("<br/>" + Math.sqrt(49));
document.write("<br/>" + Math.random());
document.write("<br/>" + Math.round(Math.random() * 10));

//var name=window.prompt("who is yoour favourite cricketer??")
//document.write("<br/>"+"your favourite cricketer is :"+ name.toUpperCase());
var num1 = 5.6;
var num2 = 6;
num1 = parseInt(num1);
num2 = parseFloat(num2)

document.write("num1" + num1);
document.write("<br/>" + "parse" + num1 + num2);
var l = 100 / "Apple";
document.write("<br/>" + 100 / "Apple");
//document.write("<br/>"+isNAN(l));

var y = 123e5;
y = 123e-5;
y = 123e+5;
document.write("<br/>" + y);
document.write("<br/>" + 2 / 0);
document.write("<br/>" + -2 / 0);

var z = 32;
document.write("<br/>" + z.toString(10));
document.write("<br/>" + z.toString(32));
document.write("<br/>" + z.toString(16));
document.write("<br/>" + z.toString(8));
document.write("<br/>" + z.toString(2));

var t = 123;
document.write("<br/>" + t.toString());

var q = 9.656;
document.write("<br/>" + q.toExponential(2));
document.write("<br/>" + q.toExponential(4));
document.write("<br/>" + q.toFixed(2));
document.write("<br/>" + q.toFixed(4));

var fruits = new Array("Apples", "oranges", "bananas");
document.write("<br/>" + fruits);
var fruits = ["Apples", 24, false];
document.write("<br/>" + fruits);
var fruits = "apples,oranges,bananas";
document.write("<br/>" + fruits);
fruits = fruits.split(",");
document.write("<br/>" + fruits);
var fruits = "apples!oranges!bananas";
fruits = fruits.split("!");
document.write("<br/>" + fruits);
function sayHi() {
	document.write("Hi there!");
}
sayHi();

function sayHi(name, age) {
	document.write("<br/>" + "Hi " + name + ". your age is " + age);
}

sayHi("Arun", 25);

function add(num1, num2) {
	return num1 + num2;
}

document.write("<br/>" + add(2, 7));

var header = document.getElementById("header");
header.innerHTML = "Hi I am document header";
header.style.color = "red";
header.style = "color:blue";


var link = document.getElementById("link");
link.href = "https://www.google.com/";
link.style.color = "red";
link.style = "color:green";

function handleCLick() {
	alert("function you clicked me");
}

function handleCLick(element) {
	element.innerHTML = "Clicked";
	element.style = "color:red";
}

var image = document.getElementById("image");
image.addEventListener("mouseover", function() { //mouseout,click,
	//this.style="color:red";
	//this.width="80px";
	this.src = "111.jpg";
	this.style = "box-shadow:2px 2px 2px red";

})

function changeText(element) {
	element.innerHTML = "OOPS!";
}


var messages = document.getElementById("messages");
var textbox1 = document.getElementById("textbox");
var button = document.getElementById("button1");

document.write(textbox1.value);

button.addEventListener("click", function() {
	var message2=document.createElement("li");
	message2.innerHTML=textbox1.value;
	messages.appendChild(message2);
	textbox1.value=" ";
	//this.innerHTML = "clicked";
	//alert("Hello world");

});
document.write("<br/>");
if(10%2==0){
	document.write("10 is even number");
}else if (10%2!=0){
	document.write("10 is prime number");
}else {
	document.write("10 is not a even number");
};

var dayNum=1;

function getDayName(dayNum){
switch(dayNum){
	case 0:
	day="sunday";
	break;
	case 1:
	day="monday";
	break;
	default:
	day="day doesn't exist";
	
}
return day;	
}


document.write("<br/>"+ "day name is:"+ getDayName(1));

var Person={
	firstName:"arun teja",
	lastname:" Bodapati",
	age:25,
	isMale:true,
	occupation:"no-one",
	
	fullName:function(){
	document.write("<br/>"+"<h1>"+this.firstName+this.lastname+"</h1>");
}

}

document.write("<br/>"+Person);
document.write("<br/>"+Person.age);
Person.fullName();


var MyMovie={
	title:"Interstellar",
	releaseYear:"2010",
	actors:[
		{
			name:"Jessie Eisenberg",
			birthdate:new Date("October 5,1983"),
			hometown:"NewYork,NewYork"
		},
		{
			name:"Roonie maara",
			birthdate:new Date("April 17,1985"),
			hometown:"Bedford NewYork"
		}
		
	]
}

document.write("<br/>"+ MyMovie.actors[1].name);
document.write("<br/>"+MyMovie.actors[0].hometown);
document.write("<br/>"+MyMovie.title);


for(var i=0;i<4;i++){
	for(var j=0;j<4;j++){
		document.write("<br/>"+"i="+i+" j="+j);
	}
}

var friends=["Arun","virat","rohit"];
for(var i=0;i<friends.length;i++){
	document.write("<br/>"+friends[i]);
}

friends.forEach(function(element){
	document.write("<br/>"+element);
});

var numberGrid=[
	[1,2,3],
	[4,5,6],
	[7,8,9]
]

document.write("<br/>"+numberGrid);

var i=1;
while(i<10){
	document.write("<br/>"+i);
	i++
}

var j=1;
do{
	document.write("<br/>"+j);
	j++;
}while(j>10)



function sayHi2(){
	alert("Hi Rohit");
}

/*var password="wordpass";
var response;
/*while(response!=password){
	response=window.prompt("Enter Password");
}
alert("you got it");*/

/*
var entryCount=0;
var entryLimit=3;
var error=false;

while(response!=password&&!error){
	if(entryCount<entryLimit){
		response=window.prompt("Enter your passwprd");
		entryCount++;
	}else{
		error=true;
	}
}
if(error){
	alert("too many entries");
	
}else{
	alert("you got it");
}



var questions=[
	{
	prompt:"what color are apples? \n (a) Red/Green\n\ (b) purple\n (c) orange",
	answer:"a"
	
},
{
	prompt:"what color are Bananas? \n(a) Teal\n (b) Magneta\n (c) yellow",
	answer:"c"
},
{
	prompt:"what color are StrawBerries? \n(a) yellow\n (b) red\n (c) Blue",
	answer:"b"
}
];

var score=0;
for(var i=0;i<questions.length;i++){
	var response=window.prompt(questions[i].prompt);
	if(response==questions[i].answer){
		score++;
		alert("correct!");
	}else{
		alert("wrong!");
	}
}
alert("you got "+ score+"/"+questions.length);*/


var textbox2=document.getElementById("textbox2");
var button3=document.getElementById("btn");
button3.addEventListener("click",function(){
	localStorage.name2=textbox2.value;
	//alert(textbox2.value);
});

//document.write("<br/>"+"HI "+name2);

	console.log(11);

const PI = 3.141592653589793;
//PI=5;
document.write("<br/>"+PI);

var $=2;
document.write("<br/>"+$);

var x=2;
var _100=5;
var z=-x+_100;
document.write("<br/>"+_100);

var x=5;
var y=2;
//x**=y;

//document.write("<br/>"+x**y);




