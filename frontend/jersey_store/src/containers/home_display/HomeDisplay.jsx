import React from 'react';
import './home_display.css'
import { Jersey } from '../../components/Index';
import images from '../../assets/jersey_images/images';
import { BsArrowLeftShort, BsArrowRightShort } from 'react-icons/bs';


const HomeDisplay = (props) => {

  const scrollRef = React.useRef(null);

  const scroll = (direction) => {
    const { current } = scrollRef;

    if (direction === 'left') {
      current.scrollLeft -= 300;
    } else {
      current.scrollLeft += 300;
    }
  };

  return (
    <div className='dw__home-display section__margin'>

      <div className='dw__home-display_title'>
        <h1>{props.title}</h1>
        <p>{props.click}</p>
      </div>

      <div className='dw__home-display_container' ref={scrollRef}>
        <div className='dw__home-display_container_images'>
          {[images.barca_men, images.madrid_women, images.arsenal_kid, images.city_men, images.barca2_men, images.mardid2_women].map((image) => (
            <Jersey img1={image} status ={props.status}/>
          ))}
        </div>

        <div className='dw__home-display-arrows'>
          <BsArrowLeftShort className="dw__home-display_arrow-icon" onClick={() => scroll('left')} />
          <BsArrowRightShort className="dw__home-display_arrow-icon" onClick={() => scroll('right')} />
        </div>
      </div>

    </div>
  )
}

export default HomeDisplay