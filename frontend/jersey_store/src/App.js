
import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Home from './pages/home/Home';
import Jersy from './pages/jersey/Jersey';
import Men from './pages/men/Men';
function App() {
  return (

    <BrowserRouter>
      <Routes>
        <Route index element = {<Home/>}/>
        <Route path='/men' element = {<Men/>}/>
      </Routes>
    </BrowserRouter>

    // <div className="App">
    //   <h1>DRRIBLE WEAR</h1>
    // </div>
  );
}

export default App;
