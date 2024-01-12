
import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Home from './pages/home/Home';

function App() {
  return (

    <BrowserRouter>
      <Routes>
        <Route index element = {<Home/>}/>
      </Routes>
    </BrowserRouter>

    // <div className="App">
    //   <h1>DRRIBLE WEAR</h1>
    // </div>
  );
}

export default App;
