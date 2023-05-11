package com.suhel.imagine.editor.model.layers.examples

import com.suhel.imagine.editor.model.layers.EffectLayer

class ContrastLayer : EffectLayer(
    "Contrast",
    """
        vec3 process(vec3 color) {
            return vec3(color.r * color.r, color.g * color.g, color.b * color.b);
        }
    """.trimIndent()
)