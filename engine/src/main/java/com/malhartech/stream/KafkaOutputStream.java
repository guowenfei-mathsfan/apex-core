/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.malhartech.stream;

import com.malhartech.dag.Sink;
import com.malhartech.dag.Stream;
import com.malhartech.dag.StreamConfiguration;
import com.malhartech.dag.StreamContext;
import com.malhartech.dag.Tuple;
import kafka.javaapi.producer.Producer;


/**
 *
 * @author Chetan Narsude <chetan@malhar-inc.com>
 */
public class KafkaOutputStream
        implements Stream, Sink
{

  @Override
  public void setup(StreamConfiguration config)
  {
    Producer producer;
    
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void setContext(StreamContext context)
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void teardown()
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void doSomething(Tuple t)
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
}
