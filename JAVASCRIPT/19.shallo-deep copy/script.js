// const aArray = [1,2,3];

// const bArray = [...aArray, 4];

// console.log('aArray: ', aArray);
// console.log('bArray: ', bArray);
// console.log('aArray === bArray: ', aArray === bArray);

// const cArray = Object.assign([], bArray);
// console.log('cArray: ', cArray);
// console.log('cArray === bArray: ', cArray === bArray);

// cArray.push([5, 6, 7]);
// console.log('cArray: ', cArray);
// const dArray = [...cArray, 10];
// console.log('dArray: ', dArray);
// dArray[4].push(8);
// console.log('cArray: ', cArray);
// console.log('dArray: ', dArray);

const aObject = {
    "a": "a",
    "b": "b",
    "cObject": {"a": 1, "b": 2}
}

// Object.freeze(aObject);
// aObject.a = "c";
// console.log('aObject: ', aObject);

// aObject.cObject.a = 3;
// console.log('aObject: ', aObject);

// const newAObject = JSON.parse(JSON.stringify(aObject));

// console.log('aObject: ', aObject);
// console.log('newAObject: ', newAObject);
// aObject.cObject.a = 3;
// console.log('aObject: ', aObject);
// console.log('newAObject: ', newAObject);

const newAObject = {...aObject, cObject: {...aObject.cObject}};

console.log('aObject: ', aObject);
console.log('newAObject: ', newAObject);
aObject.cObject.a = 3;
console.log('aObject: ', aObject);
console.log('newAObject: ', newAObject);
