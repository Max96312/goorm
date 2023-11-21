import React from 'react'
import ExpenseItem from './ExpenseItem'

const ExpenseList = ({expenses}) => {
  return (
    <>
    <ul className='list'>
        {/* Expense List */}
        {expenses.map(expense => {
            return (
                <ExpenseItem 
                    expense={expense}
                    key={expense.id}
                />
            )
        })}
        
    </ul>
    <button className='btn'>
        목록 지우기
    </button>
    </>
  )
}

export default ExpenseList