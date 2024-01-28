import React from 'react';

import './cart_jersey-container.css';

import UP from '../../../../assets/up.png';
import DOWN from '../../../../assets/down.png'

const Cart_JerseyContainer = (props) => {
  return (
    <div className='dw__cart-jersey-container'>

      <div className='d__cart-jersey-container_image'>
        <img src={props.image} alt="jersy_image" />
      </div>

      <div className='dw__cart-jersey-container_content'>

        <div className='dw__cart_content_title'>
          <h3>{props.jersey_name}</h3>
          <p>{props.jerey_year}</p>
          <p>{`${props.jersey_gender} + ${props.home_or_away}`}</p>
        </div>

        <div className='dw__cart_content_price'>
          <h3>{props.jersey_price}</h3>
        </div>

        <div className='dw__cart-conetent_qty'>
          <div className='dw__cart-content_qty-left'>
            <p>Qty :</p>
          </div>
          <div className='dw__cart-content_qty-right'>
            <p></p>
            <div dw__qty-right-images>
              <img src={UP} alt="" />
              <img src={DOWN} alt="" />
            </div>
          </div>
        </div>
        
      </div>

    </div>
  )
}

export default Cart_JerseyContainer
