import React from 'react'

const ExpenseItem = ({ expense }) => {
  return (
    <li>
        <div>
            <span className='expense'>{expense.charge}</span>
            <span className='amount'>{expense.amount}원</span>
        </div>
        <div>
            <button>
                수정
            </button>
            <button onClick={() => }>
                삭제
            </button>
        </div>
    </li>
  )
}

export default ExpenseItem