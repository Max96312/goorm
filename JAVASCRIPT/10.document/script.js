let val;

val = document;

val = document.baseURI;
val = document.head;
val = document.body;

val = document.forms;
val = document.forms[0];
val = document.forms[0].classList;
val = document.forms[0].className;

val = document.scripts[1].getAttribute('src');

const headerContainer = document.getElementById('header-container');
// headerContainer.style.display = 'none';

// console.log(headerContainer);

headerContainer.textContent = 'Hello World!';
headerContainer.innerText = 'Inner Text';
headerContainer.innerHTML = '<span>Inner HTML</span>';

const items = document.getElementsByClassName('list-group-item');
console.log(items);

items[0].style.color = 'red';
items[3].textContent = 'Hello World!';

let list = document.getElementsByTagName('li');
console.log(list);

// lists.forEach((list) => {
//     console.log(list);
// });

lists = Array.from(list);
console.log(list);

lists.forEach((list, index) => {
    list.textContent = `${index}. List`
    console.log(list);
});

const liOdd = document.querySelectorAll('li:nth-child(odd)');

liOdd.forEach((li) => {
    li.style.background ='gray';
}); 