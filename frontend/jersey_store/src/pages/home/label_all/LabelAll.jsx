import React from 'react';
import './labelAll.css';
import leftImage from '../../../assets/labelAll_left.png';
import righttImage from '../../../assets/labelAll_right.png';

const LabelAll = () => {
  return (
    <div className='dw__allLabel'>
      <img src={leftImage} alt="img_men" className='dw__allLabel_leftImg' />

      <div className='dw__allLabel_content'>
          <h1>NEW YEAR NEW JERSEYS</h1>
          <p>New Jerseys are coming  and they are so good </p>
          <div className='dw__allLabel_content-button'>SHOP NOW</div>
      </div>

      <img src={righttImage} alt="img_women" className='dw__allLabel_rightImg' />

    </div>
  )
}

export default LabelAll