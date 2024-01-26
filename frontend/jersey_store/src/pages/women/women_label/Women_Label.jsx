import React from 'react'

import './women_label.css';

import Brand_Logos from '../../../assets/brand_logos.png'
import Women_Img from '../../../assets/women_cover-image.png'
const Women_Label = () => {
  return (
    <div className='dw__women-label'>

      <div className='dw__women-label_content'>
        <h1>CHICK AND BOLD... IGNITE YOUR GOAL...</h1>
        <p className='dw__women-label_p1'>Women’s Jerseys - </p>
        <p className='dw__women-label_p2'>Where Passion Meets Fashion on the Field...</p>
        <img src={Brand_Logos} alt="" />
      </div>

      <div className='dw__women-label_image'>
        <img src={Women_Img} alt="" />
      </div>
     
    </div>
  )
}

export default Women_Label
