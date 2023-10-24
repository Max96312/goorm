// let x = 0;
// const numberUp = () => x += 1;
// console.log(numberUp());
// console.log(x);

// let x = 0;
// const numberUp = (num) => num += 1;
// console.log(numberUp(x));
// console.log(x);

const alphabetArray = ['A', 'B'];
// const addItemToArray = (orignalArray, newItem) => {
//     orignalArray.push(newItem);
//     return orignalArray;
// }

// console.log(addItemToArray(alphabetArray, 'C'));
// console.log(alphabetArray);

const pureAddItemToArray = (orignalArray, newItem) => {
    return [...orignalArray, newItem]
}

console.log(pureAddItemToArray(alphabetArray, 'C'));
console.log(alphabetArray);