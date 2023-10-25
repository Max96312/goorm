// function makeIterator(SVGAnimatedNumberList){
//     let nextIndex = 0;

//     return{
//         next: function(){
//             return nextIndex < SVGAnimatedNumberList.length ?
//             {
//                 value: SVGAnimatedNumberList[nextIndex++],
//                 done: false
//             } :
//             {
//                 value: undefined,
//                 done: true
//             }
//         }
//     }
// }

// const numbersArray = [1,2,3];

// // const numbersIterator = makeIterator(numbersArray);

// const numbersIterator = numbersArray[Symbol.iterator]()

// console.log(numbersIterator.next());
// console.log(numbersIterator.next());
// console.log(numbersIterator.next());
// console.log(numbersIterator.next());

// const numbersIterable = [1,2,3];
// const numbersNotIterable = {0:1,1:2,2:3};

// console.log(typeof numbersIterable);
// console.log(typeof numbersNotIterable);
// for (const n of numbersNotIterable) {
//     console.log(n);
// }

// const set = new Set([1,2,3,4,5,6,7,8,9,10]);
// console.log('set', set);
// const map = new Map([['a', 1], ['b', 2]]);
// console.log('map', map);

// console.log(set[Symbol.iterator]());
// console.log(map[Symbol.iterator]());

// function* sayNumbers(){
//     yield 1;
//     yield 2;
//     yield 3;
// }

// const number = sayNumbers();

// console.log(number.next());
// console.log(number.next());
// console.log(number.next());
// console.log(number.next());

// function* generatorFunction(){
//     yield 1;
// }

// const generator = generatorFunction();

// // generator = generator[Symbol.iterator]();

// console.log(generator.next());

// function* createIds(){
//     let index = 1;

//     while(true){
//         yield index++;
//     }
// }

// const gen = createIds();

// console.log(gen.next());
// console.log(gen.next());
// console.log(gen.next());
// console.log(gen.next());
// console.log(gen.return(10));

function* generatorFunction(){
    yield* [1,2,3,4,5,6,7,8,9,10];
}

const generator = generatorFunction();

for (const number of generator) {
    console.log(number);
}
