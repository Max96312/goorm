// const fullName = function (city) {
//     console.log(this.firstName + ' ' + this. lastName, city);
// }

// const person1 = {
//     firstName: 'John',
//     lastName: 'Doe'
// }

// fullName.call(person1, "Oslo");

// const fullName = function (city) {
//     console.log(this.firstName + ' ' + this. lastName, city);
// }

// const person1 = {
//     firstName: 'John',
//     lastName: 'Doe'
// }

// fullName.apply(person1, ["Olso"]);

function func(language) {
    if(language === "kor"){
        console.log(`language: ${this.korGreeting}`);
    }else {
        console.log(`language: ${this.engGreeting}`);
    }
}

const greeting = {
    korGreeting: '안녕하세요',
    engGreeting: 'Hello'
}

const boundFunc = func.bind(greeting);
boundFunc("kor");