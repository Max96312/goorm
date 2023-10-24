let val;

const list = document.querySelector('ul.list-group');
const listItems = list.querySelector('li.list-group-item:first-child');

console.log(list);
console.log(listItems);

val = list.childNodes;
val = list.childNodes[0];
val = list.childNodes[0].nodeName;
val = list.childNodes[3];
val = list.childNodes[3].nodeType;

val = list.children;
val = list.children[1];
list.children[1].textContent = 'Hello World!';

val = list.firstChild;

val = list.firstElementChild;

val = list.lastChild;

val = list.lastElementChild;

val = list.childElementCount;

val = listItems.parentNode;
val = listItems.parentElement;
val = listItems.parentElement.parentElement;

val = listItems.nextSibling;
val = listItems.nextElementSibling;
val = listItems.nextElementSibling.nextElementSibling;
val = listItems.nextElementSibling.nextElementSibling.previousElementSibling;

val = listItems.previousElementSibling;
val = list.previousElementSibling;

console.log(val);