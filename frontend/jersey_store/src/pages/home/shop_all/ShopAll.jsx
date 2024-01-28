import React from 'react';
import Kids from '../../../assets/shop_kids.png';
import Men from '../../../assets/shop_men.png';
import Women from '../../../assets/shop_women.png';


import './shopAll.css';


const ShopAll = (props) => {
  return (
    <div className='dw__shop-all section__margin'>

      <div className='dw__shop-all__title'>
        <h1>{props.title}</h1>
        <p>{props.click}</p>
      </div>

      <div className='dw__shop-all__body'>

        <div className='dw__shop-all__men__container'>
          <img src={Men} alt="men" />
          <div className='dw__shop-all__men__container_button button_black'>SHOP MEN</div>
        </div>

        <div className='dw__shop-all__kids__container'>
          <img src={Kids} alt="kids" />
          <div className='dw__shop-all__kids__container_button button_black'>SHOP KIDS</div>
        </div>

        <div className='dw__shop-all__women__container'>
          <img src={Women} alt="kids" />
          <div className='dw__shop-all__women__container_button button_black'>SHOP WOMEN</div>
        </div>

      </div>

    </div>
  )
}

export default ShopAll