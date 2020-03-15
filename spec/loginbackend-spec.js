var Request = require("request");

describe("Server", () => {
    var server;
    beforeAll(() => {
        server = require("../loginbackendlol");
    });
    afterAll(() => {
        server.close();
    });
    describe("POST /", () => {
        var data = {};
        beforeAll((done) => {
            Request.post("silly-stonebraker-e437ea.netlify.com/", (error, response, body) => {
                data.status = response.statusCode;
                //data.body = body;
                done();
            });
        });
        if(data.status==200)
        {
        it("Status 200 ", () => {
            expect(data.status).toBe(200);
            //expect(data.status).toBe(500);
        });
    }
    else if(data.status==500)
    {
        it("Status 500 ", () => {
            expect(data.status).toBe(500);
            //expect(data.status).toBe(500);
        });
    }
        
    });
    describe("GET /forgotpassword", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/forgotpassword", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    describe("GET /feedback", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/feedback", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    describe("GET /changepassword", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/forgotpassword", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    describe("GET /b", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/b", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    describe("GET /back", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/back", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    describe("GET /attend", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/attend", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    describe("GET /archive", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/archive", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    describe("GET /resetpassword", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/resetpassword", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });

    describe("GET /forgotpassword", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/forgotpassword", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    describe("GET /done", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/done", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });
    // describe("POST /ret", () => {
    //     var data = {};
    //     beforeAll((done) => {
    //         Request.post("silly-stonebraker-e437ea.netlify.com/ret", (error, response, body) => {
    //             data.status = response.statusCode;
    //            // data.body = JSON.parse(body);
    //             done();
    //         });
    //     });
    //     it("Status 200", () => {
    //         expect(data.status).toBe(200);
    //     });
        
    // });
    // describe("POST /feedbackView", () => {
    //     var data = {};
    //     beforeAll((done) => {
    //         Request.post("silly-stonebraker-e437ea.netlify.com/feedbackView", (error, response, body) => {
    //             data.status = response.statusCode;
    //            // data.body = JSON.parse(body);
    //             done();
    //         });
    //     });
    //     it("Status 200", () => {
    //         expect(data.status).toBe(200);
    //     });
        
    // });
    
    
    // describe("POST /attendView", () => {
    //     var data = {};
    //     beforeAll((done) => {
    //         Request.post("silly-stonebraker-e437ea.netlify.com/attendView", (error, response, body) => {
    //             data.status = response.statusCode;
    //            // data.body = JSON.parse(body);
    //             done();
    //         });
    //     });
    //     it("Status 200", () => {
    //         expect(data.status).toBe(200);
    //     });
        
    // });
    // describe("POST /archiveSubmit", () => {
    //     var data = {};
    //     beforeAll((done) => {
    //         Request.post("silly-stonebraker-e437ea.netlify.com/attendView", (error, response, body) => {
    //             data.status = response.statusCode;
    //            // data.body = JSON.parse(body);
    //             done();
    //         });
    //     });
    //     it("Status 200", () => {
    //         expect(data.status).toBe(200);
    //     });
        
    //});
    // describe("POST /pas", () => {
    //     var data = {};
    //     beforeAll((done) => {
    //         Request.post("silly-stonebraker-e437ea.netlify.com/pas", (error, response, body) => {
    //             data.status = response.statusCode;
    //            // data.body = JSON.parse(body);
    //             done();
    //         });
    //     });
    //     it("Status 200", () => {
    //         expect(data.status).toBe(200);
    //     });
        
    // });

    describe("GET /studpage", () => {
        var data = {};
        beforeAll((done) => {
            Request.get("silly-stonebraker-e437ea.netlify.com/studpage", (error, response, body) => {
                data.status = response.statusCode;
               // data.body = JSON.parse(body);
                done();
            });
        });
        it("Status 200", () => {
            expect(data.status).toBe(200);
        });
        
    });

//   describe("POST /glect", () => {
//         var data = {};
//         beforeAll((done) => {
//             Request.post("silly-stonebraker-e437ea.netlify.com/glect", (error, response, body) => {
//                 data.status = response.statusCode;
//                // data.body = JSON.parse(body);
//                 done();
//             });
//         });
//         it("Status 200", () => {
//             expect(data.status).toBe(200);
//         });
        
//     });

    // describe("POST /studbackend", () => {
    //     var data = {};
    //     beforeAll((done) => {
    //         Request.post("silly-stonebraker-e437ea.netlify.com/studbackend", (error, response, body) => {
    //             data.status = response.statusCode;
    //            // data.body = JSON.parse(body);
    //             done();
    //         });
    //     });
    //     it("Status 200", () => {
    //         expect(data.status).toBe(200);
    //     });
        
    // });

    // describe("POST /studbackend", () => {
    //     var data = {};
    //     beforeAll((done) => {
    //         Request.post("silly-stonebraker-e437ea.netlify.com/studbackend", (error, response, body) => {
    //             data.status = response.statusCode;
    //            // data.body = JSON.parse(body);
    //             done();
    //         });
    //     });
    //     it("Status 200", () => {
    //         expect(data.status).toBe(200);
    //     });
        
    // });
    // describe("POST /sec", () => {
    //     var data = {};
    //     beforeAll((done) => {
    //         Request.post("silly-stonebraker-e437ea.netlify.com/sec", (error, response, body) => {
    //             data.status = response.statusCode;
    //            // data.body = JSON.parse(body);
    //             done();
    //         });
    //     });
    //     it("Status 200", () => {
    //         expect(data.status).toBe(200);
    //     });
        
    // });

    
});
