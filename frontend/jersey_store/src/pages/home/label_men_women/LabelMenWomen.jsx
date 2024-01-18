import React from 'react'
import './labelMenWomen.css'
import Men_Women_Img from '../../../assets/men_women.png';
import Brand_Logo_Img from '../../../assets/brand_logos.png'

const LabelMenWomen = () => {
  return (
    <div className='dw__label_Men-Women'>


      <img src={Brand_Logo_Img} alt="brand_logo-img" className='brand_logo-img' />

      <div className='dw__label_Men-Women__content'>
        <h1>FOR HIM, FOR HER UNLEASH THE GAME</h1>
        <p>Elevate Your Style With Every Jersey !</p>
        <div className='dw__label_Men-Women__content__button_container'>
          <div className='dw__label_Men-Women__button-men button_black'>SHOP MEN</div>
          <div className='dw__label_Men-Women__button-women button_black'>SHOP WOMEN</div>
        </div>
      </div>

      <img src={Men_Women_Img} alt="men_women-img" className='men_women-img' />

    </div>
  )
}

export default LabelMenWomen

