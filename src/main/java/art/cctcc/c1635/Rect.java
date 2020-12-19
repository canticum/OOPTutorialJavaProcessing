/*
 * Copyright 2020 Jonathan Chang, Chun-yien <ccy@musicapoetica.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package art.cctcc.c1635;

/**
 *
 * @author Jonathan Chang, Chun-yien <ccy@cctcc.art>
 */
public class Rect extends MyObject {

   public Rect(float x, float y, float size, int color) {
      super(x, y, size, color);
   }

   @Override
   public void paint(MySketch canvas) {
      canvas.fill(color);
      canvas.stroke(darkerColor());
      canvas.rect(canvas.width * x - size / 2,
              canvas.height * y - size / 2,
              size, size);
   }
}
