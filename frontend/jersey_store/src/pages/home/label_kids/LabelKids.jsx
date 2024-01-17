import React from 'react'
import './labelKids.css'
import kids_label from '../../../assets/kids_label.png'
import brands_logo from '../../../assets/brand_logos.png'

const LabellKids = () => {
  return (
    <div className='dw__label-kids'>

      <div className='dw__label-kids_container'>
        <img src={kids_label} alt="kids_label" className='kids_label-img' />

        <div className='dw__label-kids__content'>
          <h1>LITTLE CHAMPIONS, BIG DREAMS</h1>
          <p>Where Style Meets Play In Every Kid’s Jersey</p>
          <div className='dw__label-kids__button button_black'>SHOP KIDS</div>
        </div>

        <img src={brands_logo} alt="brand_logo" className='brand_logo-img' />
      </div>



    </div>
  )
}

export default LabellKids