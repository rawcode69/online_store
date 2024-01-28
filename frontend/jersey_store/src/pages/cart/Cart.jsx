import React from 'react'
import { Checkout_Status, Footer, Navbar } from '../../components/Index'
import CartContainer from './cart_container/CartContainer'

const Cart = () => {
  return (
    <div>
        <Navbar/>
        <Checkout_Status/>
        <CartContainer/>
        <Footer/>
    </div>
  )
}

export default Cart
