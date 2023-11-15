import React, { Component } from "react";
import "../css/ExpenseList.css";

export class ExpenseList extends Component {
  render() {
    return (
      <React.Fragment>
        <ul className="list">{/* {Expense Item} */}</ul>
        <button className="btn">목록지우기</button>
      </React.Fragment>
    );
  }
}

export default ExpenseList;