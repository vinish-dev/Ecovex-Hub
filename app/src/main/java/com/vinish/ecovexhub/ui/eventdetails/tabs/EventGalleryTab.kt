package com.vinish.ecovexhub.ui.eventdetails.tabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.ui.eventdetails.components.GalleryImage

@Composable
fun EventGalleryTab(
    event: Event,
    modifier: Modifier = Modifier
) {
    
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        
        // split images list into a new list having 2 item
        event.galleryImages.chunked(2).forEach { 
            rowImage ->
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                
                // call GalleryImage for the 2 items of the list
                rowImage.forEach { imageRes ->
                    GalleryImage(imageRes = imageRes, modifier = Modifier.weight(1f))
                }
                
                if (rowImage.size == 1){
                    Spacer(Modifier.weight(1f))
                }

            }
        }
    }
}
