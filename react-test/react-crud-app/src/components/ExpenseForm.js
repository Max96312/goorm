import React from 'react'

const ExpenseForm = ({charge, amount, handleCharge, handleAmount, handleSubmit}) => {
    
  return (
    <form>
        <div>
            <div>
                <label>지출 항목</label>
                <input
                    type='text'
                    id='charge'
                    name='charge'
                    placeholder='렌트비'
                    value={charge}
                    onChange={handleCharge}
                />
            </div>
            <div>
                <label>비용</label>
                    <input
                        type='number'
                        id='amount'
                        name='amount'
                        placeholder='100'
                        value={amount}
                        onChange={handleAmount}
                    />
            </div>
        </div>
        <button type='submit'>
            제출
        </button>
    </form>
  )
}

export default ExpenseForm