import React from 'react';
import './jersey.css'
import { StatusLabel } from '../Index';


const Jersey = (props) => {
  return (
    <div className='dw__jersey'>

      <div className='dw__jersey_img'>
        
        <div>
          <StatusLabel status={props.status} />
        </div>
          <img src={props.img1} alt="img_1" />
       
      </div>

      <div className='dw__jersey_description'>
        <h3></h3>
        <p></p>
      </div>

    </div>
  )
}

export default Jersey