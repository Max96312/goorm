import './App.css';
import ExpenseForm from './components/ExpenseForm';
import ExpenseList from './components/ExpenseList';

function App() {

  const [expenses, setExpenses] = useState([
    {id: 1, charge: "렌트비", amount: 1600},
    {id: 2, charge: "교통비", amount: 400},
    {id: 3, charge: "식비", amount: 200},
  ])

  const [charge, setCharge] = useState('');
  const [amount, setAmount] = useState(0);

  const handleSubmit = e => {
    e.preventDefault();

    if(charge !== "" && amount > 0){
      const newExpense = {
        id: crypto.randomUUID(),
        charge,
        amount
      }

      setExpenses([...expenses, newExpense])
      setCharge("");
      setAmount(0);
    }else{
      alert('작성해주세요.');
    }
  }

  const handleDelete = (id) => {
    const newExpense = expenses.filter(expense => expense.id !== id)
    setExpenses(newExpense)
  }

  const handleCharge = (e) => {
    setCharge(e.target.value)
  }

  const handleAmount = (e) => {
    setAmount(e.target.valueAsNumber);
  }

  

  return (
    <main>
      <h1>예산 계산기</h1>
      <div>
        {/* Form */}
        <ExpenseForm 
          charge={charge}
          amount={amount}
          handleCharge={handleCharge}
          handleAmount={handleAmount}
          handleSubmit={handleSubmit}
        />
      </div>

      <div>
        {/* List */}
        <ExpenseList 
          expenses={expense}
          handleDelete={handleDelete}
        />
      </div>
      <div>

      </div>
      <div>
        총지출:
        <span>
          {expenses.reduce((acc, curr)=> {
            return(acc += curr.amount)
          }, 0)}
        </span>
        원
      </div>
    </main>
  );
}

export default App;
