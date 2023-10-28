// window.onload = function() {
//     let text = document.getElementById('text');

//     text.innerText = 'HTML 문서 loaded';
// }

// const aElement = document.querySelector('a');

// console.log(aElement);

// aElement.addEventListener('click', () => {
//     alert('a Element clicked');
// })

// const buttonElement = document.querySelector('.btn2');

// buttonElement.addEventListener('click', (event) => {
//     let val;
//     val = event.target;
//     val = event.target.id;
//     val = event.target.className;
//     val = event.target.classList;
//     val = event.type;
//     val = event.clientY;
//     val = event.offsetY;

//     console.log(val);
// })

// console.log(buttonElement);



// submitBtn.addEventListener('click', handleEvent);
// submitBtn.addEventListener('dblclick', handleEvent);
// submitBtn.addEventListener('mousedown', handleEvent);
// submitBtn.addEventListener('mouseup', handleEvent);
// submitBtn.addEventListener('mouseenter', handleEvent);
// submitBtn.addEventListener('mouseleave', handleEvent);
// submitBtn.addEventListener('mousemove', handleEvent);

// const submitBtn = document.querySelector('.submit-btn');
const form = document.querySelector('form');
const emailInput = document.getElementById('test-text-input');
const title = document.querySelector('h2');

emailInput.value = '';

form.addEventListener('submit', handleEvent);


emailInput.addEventListener('input', handleEvent);
emailInput.addEventListener('keydown', handleEvent);

// emailInput.addEventListener('input', handleEvent);
// emailInput.addEventListener('focus', handleEvent);
// emailInput.addEventListener('blur', handleEvent);


function handleEvent(e) {
    if(e.type ==='input') {
        e.preventDefault();
        console.log(`Event type: ${e.type}`);
    }

    console.log(`Event type: ${e.type}`);
    // console.log(`Event target: ${e.target}`);
    // title.textContent = `MouseX: ${e.offsetX}, MouseY: ${e.offsetY}`;
    title.textContent = e.target.value;
}
