import React from 'react'
import './cart_container.css'
import Cart_JerseyContainer from './cart_jersery-container/Cart_JerseyContainer'

import Jersey_Image from '../../../assets/jersey_images/manchester_women/manchester_women_1.png'
const CartContainer = () => {
  return (
    <div className='dw__cart-container'>

      <div className='dw__cart-container-left'>
        <h2>YOUR CART</h2>

        <Cart_JerseyContainer
            image = {Jersey_Image}
        />
      </div>

      <div className='dw__cart-container-right'>
        <h2>SUMMARY</h2>
      </div>

    </div>
  )
}

export default CartContainer
