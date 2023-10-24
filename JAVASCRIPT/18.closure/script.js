// function outerFunc(outerVariable) {
//     return function innerFunction(innerVariable) {
//         console.log('Outter Variable: '+ outerVariable);
//         console.log('Inner Variable: '+ innerVariable);
//     }
// }

// const newFnction = outerFunc('outside');
// newFnction('inside');

// console.log(newFnction);

let a = 'a';



function functionA() {
    let b = 'b';
    function functionB(){
        let c = 'c';
        console.log(a, b, c);
    }
    functionB();
    console.log(a, b);
}
functionA();