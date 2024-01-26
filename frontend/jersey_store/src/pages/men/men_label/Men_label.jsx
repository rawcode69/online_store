import React from 'react'
import './men_label.css'


import Brand_Logos from '../../../assets/brand_logos.png'
import Men_Image from '../../../assets/men_cover-image.png'

const Men_label = () => {
  return (
    <div className='dw__men-label'>  

    <div className='dw__men-label_image'>
      <img src={Men_Image} alt="men_image" />
    </div>

    <div className='dw__men-label_content'>
      <h1>ROAR ON THE FIELD, COMMAND YOUR STYLE.</h1>
      <p className='dw__men-label_content-p1'> Men’s Jerseys - </p>
      <p className='dw__men-label_content-p2'>Embrace the Power...  Conquer the Game...</p>
      <img src={Brand_Logos} alt="brand_logo" />
    </div>

    </div>
  )
}

export default Men_label
