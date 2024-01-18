import React from 'react';
import Nike from '../../../assets/nike.png';
import Adidas from '../../../assets/adidas.png';
import Puma from '../../../assets/puma.png';
import NB from '../../../assets/nb.png'

import './brands.css';

const Brands = () => {
  return (
    <div className='dw__brands'>
      <img src={Adidas} alt="adidas" />
      <img src={Nike} alt="nike" />
      <img src={Puma} alt="puma" />
      <img src={NB} alt="new_balance" />
    </div>
  )
}

export default Brands