// class Person {
//     constructor(name, email, birthday) {
//         this.name = name;
//         this.email = email;
//         this.birthday = new Date(birthday);
//     }

//     introduce() {
//         return `Hello my name is ${this.name}`;
//     }

//     static multipleNembers(x, y){
//         return x * y;
//     }
// }

// const john = new Person('John', 'john@example.com', '7-10-91');
// console.log(john);

class Person {
    constructor(name, email) {
        this.name = name;
        this.email = email;
    }

    introduce() {
        return `Hello my name is ${this.name}`;
    }
}

class Client extends Person {
    constructor(name, email, phone, address) {
        super(name, email);

        this.phone = phone;
        this.address = address;
    }
}

const john = new Client('John', 'john@example.com', '010-0000-0000', 'New York');
console.log(john.introduce());
console.log(john);