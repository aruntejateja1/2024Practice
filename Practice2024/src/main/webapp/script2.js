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




