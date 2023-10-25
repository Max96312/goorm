// // const sym1 = Symbol();
// // const sym2 = Symbol();
// // const sym3 = Symbol('hi');

// // console.log(sym1);
// // console.log(sym2);

// // console.log(sym1 === sym2);

// // console.log(sym3.description);

// const idSym = Symbol('id');

// let carA = {
//     id: 1,
//     name: 'moring',
//     brand: 'kia',
//     price: 1000,
//     [idSym]: 300
// }


// // carA[idSym] = 300;

// // carA.id = 300;

// console.log(carA);

// const RED = Symbol('red');
// const ORANCE = Symbol('orange');
// const YELLOW = Symbol('yellow');
// const BLUE = Symbol('blue');
// const dog = 'blue';

// function getImportantLevel(color) {
//     switch (color) {
//         case RED:
//             return 'very important';
//         case ORANCE:
//             return 'important';
//         case YELLOW:
//             return 'little important';
//         case BLUE:
//             return 'not important';
//         default:
//             console.log(`${color} not included`);
//     }
// }

// console.log(getImportantLevel(RED));
// console.log(getImportantLevel(dog));

const length = Symbol('length');

class Car{
    constructor(){
        this[length] = 0;
    }

    add(brand, name){
        this[brand] = name;
        this[length]++;
    }
}

let myCars = new Car();
myCars.add('kia', 'morning');
myCars.add('hyundai', 'tusan');
myCars.add('genesis', 'gv80');

for(const car in myCars){
    console.log(car, myCars[car]);
}