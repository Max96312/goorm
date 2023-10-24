// // (
// //     function () {
// //         var aName = 'John';
// //     }
// // )();

// // console.log(aName);

// var result = (function () {
//     var name = 'John';
//     return name;
// })();

// console.log(result);

// const score = () => {
//     let count = 0;
//     return{
//         current: () => {return count},
//         increment: () => {count++},
//         reset: () => {count = 0}
//     }
// }

// console.log(typeof score);
// console.log(score);
// console.log(score().current());
// score().increment();
// console.log(score().current());

// const score = (() => {
//     let count = 0;
//     return{
//         current: () => {return count},
//         increment: () => {count++},
//         reset: () => {count = 0}
//     }
// })()

// console.log(typeof score);
// console.log(score);
// console.log(score.current());
// score.increment();
// console.log(score.current());

// const increment = () => {
//     let counter = 0;
//     console.log(counter);
//     const number = (num) =>
//         console.log(num);
//         return () => { counter++; number(counter); }
// }

// increment();
// increment();

const increment = (() => {
    let counter = 0;
    console.log(counter);
    const number = (num) =>
        console.log(num);
        return () => { counter++; number(counter); }
})();

increment();
increment();