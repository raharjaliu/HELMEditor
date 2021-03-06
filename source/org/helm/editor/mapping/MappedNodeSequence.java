/*******************************************************************************
 * Copyright C 2012, The Pistoia Alliance
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/
package org.helm.editor.mapping;

import y.base.Node;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

import org.helm.editor.data.NodeSequence;

/**
 * User: dzhelezov
 */
public class MappedNodeSequence implements NodeSequence {
    private GraphMapper mapper;
    private NodeSequence sourceSequence;

    public MappedNodeSequence(GraphMapper mapper, NodeSequence sourceSequence) {
        this.mapper = mapper;
        this.sourceSequence = sourceSequence;
    }

    public Node getStartNode() {
        return mapper.getTargetNode(sourceSequence.getStartNode());
    }

    public boolean isFloating() {
        return sourceSequence.isFloating();
    }

    public List<Node> getNodes() {
        List<Node> result = new ArrayList<Node>();
        for (Node source : sourceSequence) {
            result.add(mapper.getTargetNode(source));
        }
        return result;
    }

    public Iterator<Node> iterator() {
        return new MappedNodeIterator(mapper, sourceSequence.iterator());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MappedNodeSequence that = (MappedNodeSequence) o;

        return mapper.equals(that.mapper) && sourceSequence.equals(that.sourceSequence);

    }

    @Override
    public int hashCode() {
        int result = mapper.hashCode();
        result = 31 * result + sourceSequence.hashCode();
        return result;
    }
}
