// let user = {
//     name: 'John',
//     age: 25
// }

// console.log(user.name);
// console.log(user.hasOwnProperty('email'));

// function Person(name, email, birthday){
//     this.name = name;
//     this.email = email;
//     this.birthday = new Date(birthday);
// }

// const john = new Person('John', 'john@example.com', '7-10-91');
// const han = new Person('han', 'han@example.com', '6-19-91');
// console.log(john);
// console.log(han);

// Person.prototype.calculateAge = function(){
//     const diff = Date.new() - this.birthday.getTime();
//     const ageDate = new Date();
//     return Math.abs(ageDate.getUTCFullYear() - 1970);
// }

function Person(name, email, birthday){
    const person = Object.create(personsPrototype);
    person.name = name;
    person.email = email;
    person.birthday = new Date(birthday);
    return person;
}

const personsPrototype = {
    calculateAge: function(){
        const diff = Date.new() - this.birthday.getTime();
        const ageDate = new Date();
        return Math.abs(ageDate.getUTCFullYear() - 1970);
    }
}

const john = new Person('John', 'john@example.com', '7-10-91');
const han = new Person('han', 'han@example.com', '6-19-91');
console.log(john);
console.log(han);

