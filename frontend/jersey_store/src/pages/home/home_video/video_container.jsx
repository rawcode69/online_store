import React from 'react'
import './video_container.css'

const video_container = (props) => {
  return (
    <div className='dw__videos_body__container'>
      <div className='dw__video-full'>
        <video src={props.video1}></video>
      </div>
      <div className='dw__video_body__container-half'>
        <div className='dw__video-half_left'>
          <video src={props.video2}></video>
        </div>
        <div className='dw__video-half_right'>
          <video src={props.video3}></video>
        </div>
      </div>
    </div>
  )
}

export default video_container