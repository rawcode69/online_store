
import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Home from './pages/home/Home';
import Jersy from './pages/jersey/Jersey';
import Men from './pages/men/Men';
import Women from './pages/women/Women'
import Cart from './pages/cart/Cart';

function App() {
  return (

    <BrowserRouter>
      <Routes>
        <Route index element = {<Home/>}/>
        <Route path='/men' element = {<Men/>}/>
        <Route path='/women' element = {<Women/>}/>
        <Route path='/jersey' element = {<Jersy/>}/>
        <Route path='/cart' element = {<Cart/>}/>
      </Routes>
    </BrowserRouter>

    // <div className="App">
    //   <h1>DRRIBLE WEAR</h1>
    // </div>
  );
}

export default App;
