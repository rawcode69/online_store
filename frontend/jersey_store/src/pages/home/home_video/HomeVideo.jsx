import React from 'react'
import './homeVideo.css'
import Chelsea_Women from '../../../assets/vedios/chelsea_women.mp4';
import City_Men from '../../../assets/vedios/city_men.mp4';
import Hotspur_Women from '../../../assets/vedios/hotspur_women.mp4';
import Video_Container from './video_container';

const HomeVideo = () => {
  return (
    <div className='dw__videos section__margin'>
      <div className='dw__videos_title'>
        <h1>JOIN THE SQUAD FOR INSTAGRAM</h1>
      </div>
      <div className='dw__videos_body'>
        <Video_Container video1 = {Chelsea_Women} video2 = {City_Men} video3 = {Hotspur_Women}/>
        <Video_Container video1 = {Chelsea_Women} video2 = {City_Men} video3 = {Hotspur_Women}/>
        <Video_Container video1 = {Chelsea_Women} video2 = {City_Men} video3 = {Hotspur_Women}/>
      </div>
    </div>
  )
}

export default HomeVideo