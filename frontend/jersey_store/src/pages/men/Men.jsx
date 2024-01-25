import React from 'react'
import { Footer, Navbar } from '../../components/Index'
import { Men_Label } from '.'
import JerseyDisplay from '../../containers/jersey_dislpay/JerseyDisplay'


const Men = () => {
  return (
    <div className='Men'>
            <Navbar/> 
            <Men_Label/>
            <JerseyDisplay/>
            <Footer/>
    </div>
  )
}

export default Men
